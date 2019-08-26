package com.accenture.letovit.todolist.database;

import java.awt.Color;

import javax.persistence.Entity;
import javax.persistence.Id;

	
@Entity
public class DbLabel {

		    @Id
		    private String identifier;
		    private String label;
		    private Color color;
		    
			public String getIdentifier() {
				return identifier;
			}
			public void setIdentifier(String identifier) {
				this.identifier = identifier;
			}
			public String getLabel() {
				return label;
			}
			public void setLabel(String label) {
				this.label = label;
			}
			public Color getColor() {
				return color;
			}
			public void setColor(Color color) {
				this.color = color;
			}
	
}
