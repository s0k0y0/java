package p04.method;

public class box<T> {

		private T object;
		
		public T getObject() {
			return object;
		}
		
		public void setObject(T object) {
			this.object = object;
		}
		
		@Override
			public String toString() {
				return "사과";
			}
		
}
