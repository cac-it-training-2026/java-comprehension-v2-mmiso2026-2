package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member[] members = new Member[2];

		Member member1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		member1.showMember();

		Member member2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);
		member2.showMember();

		members[0] = member1;
		members[1] = member2;

	}

}
