package edu.baylor.ecs.Car;

import java.util.ArrayList;

public class PersonList {
	private ArrayList<Person> list = new ArrayList<Person>();

	public ArrayList<Person> getList() {
		return list;
	}

	public void setList(ArrayList<Person> list) {
		this.list = list;
	}
	
	public void store(Person person) {
		list.add(person);
	} 
    public Object[][] conver2Data(){
    	Object[][] data = new Object[list.size()][5];
    	for(int i = 0; i < list.size(); i++) {
    		data[i][0] = list.get(i).getName();
    		data[i][1] = list.get(i).getPhone();
    		data[i][2] = list.get(i).getEmail();
    		data[i][3] = list.get(i).getLicenses();
    	}
    	return data;
    }
    
}
