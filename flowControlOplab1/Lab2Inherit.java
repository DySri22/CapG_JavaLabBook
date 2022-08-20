package flowControlOplab1;

public class Lab2Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Items
{
	private int idno;
	private String title;
	private int noc;
	public int getNoc() {
		return noc;
	}
	public void setNoc(int noc) {
		this.noc = noc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	
}

class WrittenItem extends Items
{
	
	 private String author;
	 
}
