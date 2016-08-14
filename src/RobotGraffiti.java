import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
    Robot D = new Robot();
    Robot M = new Robot();
    Robot M2 = new Robot();
    Robot C = new Robot();
    D.hide();
    M2.hide();
    M.hide();
    C.hide();
    D.setSpeed(10);
    M.setSpeed(10);
    C.setSpeed(10);
    M2.setSpeed(10);
    M.penDown();
    M2.penDown();
	
    D.turn(-90);
    C.turn(90);
    D.move(300);
    C.move(200);
    C.penDown();
    D.penDown();
    D.turn(90);
    D.move(-150);
    D.move(300);
	D.turn(90);
	D.move(65);
	D.turn(45);
	D.move(40);
	D.turn(45);
	D.move(245);
	D.turn(45);
	D.move(40);
	D.turn(45);
	D.move(65);
	
	
	M2.turn(-37);
	M2.move(140);
	M2.turn(-143);
	M2.move(240);
	M.turn(37);
	M.move(140);
	M.turn(143);
	M.move(240);
	
	
	C.turn(90);
	C.move(100);
	C.turn(180);
	C.move(200);
	C.turn(45);
	C.move(60);
	C.turn(45);
	C.move(40);
	C.move(-40);
	C.turn(-45);
	C.move(-60);
	C.turn(-45);
	C.move(-200);
	C.turn(135);
	C.move(60);
	C.turn(-45);
	C.move(40);


	
	}

}
