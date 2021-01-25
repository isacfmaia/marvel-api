package com.marvel.marvelapi.validator;

public class ValidaParametroInteiro {
	
	public static Boolean parametroValido(Integer parametro){		
			
		try {
			if (parametro != null && parametro > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
}
