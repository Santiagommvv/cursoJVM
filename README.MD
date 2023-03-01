flags para JVM:

-XX:+PrintCompilation

	columnas
	
	milisegundos JVM up | orden en que compiló | caracteres | [0..4] | nombre clase/método invocado
	
	caracteres: 
	n - nativo
	s - síncrono
	! - manejo de excepción
	% - compilado a nativo, corriendo en code cache
	
	[0..4] tier de (profundidad de) compilación,
			4 siendo la mayor compilación posible (compilado a nativo)
			compilado por C2
			[1..3]
			compilado por C1