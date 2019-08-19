package com.accenture.letovit.todolist.validator;

import com.accenture.letovit.todolist.ToDoItem;

public class ToDoItemValidator {
	
	public static void validate(ToDoItem toDoItem) {
		if (toDoItem.getTitle().length() > 15) {
			throw new RuntimeException("chyba...dlhyy titulok");
		}
		if (toDoItem.getText().length() > 100) {
			throw new RuntimeException("chyba...dlhyy text");
		}
		for(int i = 0; i < toDoItem.getTitle().length(); i++) {
			Character znak = toDoItem.getTitle().charAt(i);
			if (!Character.isLetterOrDigit(znak) && !Character.isSpaceChar(znak)) {
				throw new RuntimeException("znak nie je ani cislo ani pismeno!!!!!");
			}
		}
	}
	

}
