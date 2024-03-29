package com.accenture.letovit.todolist;

import java.io.Serializable;

public class ToDoItem implements Serializable{
		private String title;
		private String text;
		private boolean finished;
		private String createdAt;
		private String id;
		private String importance;
		private String labels;
		
		
		public String getImportance() {
			return importance;
		}


		public void setImportance(String importance) {
			this.importance = importance;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		@Override
		public String toString() {
			return "TodoItem [title=" + title + ", text=" + text + ", finished=" + finished + ", createdAt=" + createdAt
					+ ", importance=" + importance + ", labels=" + labels + "]";
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getText() {
			return text;
		}


		public void setText(String text) {
			this.text = text;
		}


		public boolean isFinished() {
			return finished;
		}


		public void setFinished(boolean finished) {
			this.finished = finished;
		}


		public String getCreatedAt() {
			return createdAt;
		}


		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}


		public String getLabels() {
			return labels;
		}


		public void setLabels(String labels) {
			this.labels = labels;
		}
		
		


}
