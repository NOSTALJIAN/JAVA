module my_module_a {
	exports pack1;
//	exports pack2;
	requires transitive my_module_b;		//	my_module_b 의존 설정
}