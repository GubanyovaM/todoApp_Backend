package com.accenture.letovit.todolist.database;

import com.accenture.letovit.todolist.Label;

public class LabelConverter {
	
	public static DbLabel jsonToDbEntity(Label input, String identifier) {
	      DbLabel output = new DbLabel();

	      output.setColor(input.getColor());
	      output.setLabel(input.getLabel());
	      output.setIdentifier(identifier);

	      return output;
	  }
	
	public static Label dbEntityToJson(DbLabel input) {
	      Label output = new Label();

	      output.setColor(input.getColor());
	      output.setLabel(input.getLabel());
	      output.setId(input.getIdentifier());

	      return output;
	   }
	

}
