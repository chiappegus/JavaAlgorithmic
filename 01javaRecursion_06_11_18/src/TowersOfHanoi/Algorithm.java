package TowersOfHanoi;

public class Algorithm {

	public void solveHanoiProblem(int n, char rodFrom, char middleRod, char rodTo){
		
		if( n == 1 ){
<<<<<<< HEAD
			System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
=======
			System.out.println("Plate 1 ok from " + rodFrom + " to " + rodTo);
>>>>>>> 204e3af7c03caf0bc75f517cd26a330e3e4b3642
			return;
		}
		
		solveHanoiProblem(n-1, rodFrom, rodTo, middleRod);
		System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
		solveHanoiProblem(n-1, middleRod, rodFrom, rodTo);
	}
}
