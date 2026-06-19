package dinosauring;

public class GetSetGo {
	
		
		String name;
		int Id;
		String Role;
		Boolean place;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getRole() {
			return Role;
		}
		public void setRole(String role) {
			Role = role;
		}
		public Boolean getPlace() {
			return place;
		}
		public void setPlace(Boolean place) {
			this.place = place;
		}
		@Override
		public String toString() {
			return "Employee [Name=" + name + ", Id=" + Id + ", Role=" + Role + ", Indian=" + place + "]";
		}
		
		
		


}
