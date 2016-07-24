package entity;
// Generated 2016-6-25 13:32:00 by Hibernate Tools 3.4.0.CR1

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private int stuId;
	private Integer stuXuehao;
	private String stuRealname;
	private Integer stuCard;
	private String loginName;
	private String loginPw;
	private Integer money;
	private Integer qinshihao;

	public Student() {
	}

	public Student(int stuId) {
		this.stuId = stuId;
	}

	public Student(int stuId, Integer stuXuehao, String stuRealname, Integer stuCard, String loginName, String loginPw,
			Integer money, Integer qinshihao) {
		this.stuId = stuId;
		this.stuXuehao = stuXuehao;
		this.stuRealname = stuRealname;
		this.stuCard = stuCard;
		this.loginName = loginName;
		this.loginPw = loginPw;
		this.money = money;
		this.qinshihao = qinshihao;
	}

	public int getStuId() {
		return this.stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public Integer getStuXuehao() {
		return this.stuXuehao;
	}

	public void setStuXuehao(Integer stuXuehao) {
		this.stuXuehao = stuXuehao;
	}

	public String getStuRealname() {
		return this.stuRealname;
	}

	public void setStuRealname(String stuRealname) {
		this.stuRealname = stuRealname;
	}

	public Integer getStuCard() {
		return this.stuCard;
	}

	public void setStuCard(Integer stuCard) {
		this.stuCard = stuCard;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPw() {
		return this.loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Integer getQinshihao() {
		return this.qinshihao;
	}

	public void setQinshihao(Integer qinshihao) {
		this.qinshihao = qinshihao;
	}

}
