package com.accenture.letovit.todolist;

import java.awt.Color;
import java.io.Serializable;

public class Label implements Serializable{
		private String label;
		private Color color;
		private String id;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
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
		
		
		@Override
		public String toString() {
			return "Label [label=" + label + ", color=" + color + "]";
		}
		
		

}
