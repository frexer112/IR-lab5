package lab5;

import lejos.robotics.mapping.NXTNavigationModel;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.robotics.navigation.Navigator;
import lejos.robotics.navigation.Pose;


public class test5 {
public static void main(String[] args) throws Exception {
	




	
	DifferentialPilot lab5 = new DifferentialPilot(5.6f, 13.5f);
	lab5.setAcceleration(120);

	Navigator navigator = new Navigator(lab5);
	Pose start = new Pose(100, 0,90);
	 navigator.getPoseProvider();
	 navigator.setPose(start);
	
	
	NXTNavigationModel model = new NXTNavigationModel();
	model.addPilot(lab5);
	model.addNavigator(navigator);
	model.addPoseProvider(navigator.getPoseProvider());
	



}
}