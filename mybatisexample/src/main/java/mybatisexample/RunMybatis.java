package mybatisexample;


public class RunMybatis {
	public static void main(String[] args) {
	  VillageDAO villageDAO = new VillageDAO();	
	  //insert	
	  Village village = new Village();
	  village.setVillageName("Crossing Republic");
	  village.setDistrict("Ghaziabad");
	  villageDAO.save(village);
	  System.out.println("---Data saved---");
	  Village village1 = new Village();
	  village1.setVillageName("Cubbonpet");
	  village1.setDistrict("Bangalore");
	  villageDAO.save(village1);
	  System.out.println("---Data saved---");
	  //update
	  village = new Village();
	  village.setVid(5);
	  village.setVillageName("Dhananjaypur");
	  village.setDistrict("Varanasi");
	  villageDAO.update(village);
	  System.out.println("---Data updated---");
	  //select
	  village = villageDAO.getData(33);
	  System.out.println("id:"+village.getVid()+", Name:"+village.getVillageName()+", District:"+village.getDistrict());
	  //delete
	  villageDAO.delete(34);
	  System.out.println("---Data deleted---");
	}
}
