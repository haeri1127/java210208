package book.ch7;

public class B {
	int deptno = 0;
	public B(int deptno) {
		this.deptno = deptno;
		
	}
	int methodA() {
		int u_deptno = 0;
		return u_deptno;
	}
	void getDeptList(int u_deptno) {
		/*
		 * SELECT dname, loc FROM dept
		 *  WHERE deptno = ?
		 */
		int r_deptno = methodA();
		//u_deptno = methodA();
		
	}

	public static void main(String[] args) {

	}

}
