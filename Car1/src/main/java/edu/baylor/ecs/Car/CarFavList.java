package edu.baylor.ecs.Car;

import java.awt.List;
import java.util.ArrayList;

public class CarFavList {
	private ArrayList<Car> carList;
	
	public CarFavList() {
		carList = new ArrayList<Car>();
	}
	public void store(Car car) {
		carList.add(car);
	} 
    public Object[][] conver2Data(){
    	Object[][] data = new Object[carList.size()][5];
    	for(int i = 0; i < carList.size(); i++) {
    		data[i][0] = carList.get(i).getMake();
    		data[i][1] = carList.get(i).getModel();
    		data[i][2] = carList.get(i).getYear();
    		data[i][3] = carList.get(i).getColor();
    		data[i][4] = carList.get(i).getPrice();
    	}
    	return data;
    }
    public void delete(Car car) {
    	for(int i = 0; i < carList.size(); i++) {
    		if(carList.get(i).equals(car)) {
    			carList.remove(i);
    		}
    	}
    }
	
}
