package phonebook2;

//create table phonebook (
//	    idx      number          default phonebook_seq.nextval primary key,
//	    name     varchar2(100)   unique not null,
//	    pnum     varchar2(20)    not null,
//	    age      number          check (age >= 0),
//	    favorite char(1)         check (favorite in ('Y', 'N'))

public class PhonebookDTO {
	private int idx;
	private String name;		
	private String pnum;		
	private String favorite;	
	private int age;
	
	@Override
	public String toString() {
		String form = "%s %s %13s %2s세 %s";
		form = String.format(form, idx, name, pnum, age, favorite.equals("Y") ? "★" : "☆");
		return form;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}		

	
}
