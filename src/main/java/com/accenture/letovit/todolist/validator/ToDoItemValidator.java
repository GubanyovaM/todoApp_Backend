package com.accenture.letovit.todolist.validator;

import java.util.ArrayList;

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
		
		// profanity validator ver.1 
		String[] profanityWords = {"fuck", "buck", "duck", "fff", "ggg"};
		for (String word : profanityWords) {
		
			if (toDoItem.getTitle().contains(word) || toDoItem.getText().contains(word)) {
				throw new RuntimeException("škaredé slovo!! " + word +" no no!!");
			}
		}
		
		// profanity validator ver.2
		ArrayList<String> profanityWords2 = new ArrayList<String>();
			profanityWords2.add("nnn"); 
			profanityWords2.add("aaa"); 
			profanityWords2.add("eee");
			
			profanityWords2.forEach(word2 -> {
				if (toDoItem.getTitle().contains(word2) || toDoItem.getText().contains(word2)) {
					throw new RuntimeException("škaredé slovo!! " + word2 + " no no!!");
				}
				
			});
		
	}
	

}
