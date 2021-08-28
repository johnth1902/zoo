package com.example.zoo;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.zoo.model.Animal;

@RestController("/animal")
public class ZooController {

	@GetMapping("/test")
	public String test() {
		return "Test @ " + LocalDateTime.now();
	}

	@GetMapping("/behavior")
	public String test(@RequestParam String className) throws Exception {
		Set<Class<?>> classes = getSuperClasses(Class.forName("com.example.zoo.model." + className),
				new HashSet<Class<?>>());
		return getMethodNames(classes);
	}

	private String getMethodNames(Set<Class<?>> classes) {
		Set<String> methodNames = classes.stream().map(cls -> cls.getDeclaredMethods())
				.flatMap(methods -> Arrays.asList(methods).stream()).map(Method::getName)
				.filter(mName -> !mName.startsWith("get") && !mName.startsWith("is")).collect(Collectors.toSet());
		return methodNames.stream().collect(Collectors.joining(","));
	}

	private static Set<Class<?>> getSuperClasses(Class<?> theClass, Set<Class<?>> superClasses) {
		superClasses.add(theClass);
		superClasses.addAll(Arrays.asList(theClass.getInterfaces()));
		if (theClass.getSuperclass().getSimpleName().equals(Animal.class.getSimpleName())) {
			superClasses.add(Animal.class);
			return superClasses;
		} else {
			return getSuperClasses(theClass.getSuperclass(), superClasses);
		}
	}
}
