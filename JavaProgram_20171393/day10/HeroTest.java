package day10;
import java.util.*;

public class HeroTest {

	public static void main(String[] args) {
//		Hero hero1 = new Hero();
		Warrior wr = new Warrior();
		Wizard wz = new Wizard();
		Archer ac = new Archer();
		
		Hero hero2 = new Warrior();
		
//		hero1.attack();
		
		ArrayList<Hero> list = new ArrayList<Hero>();
		
		list.add(wr); //list.add( new Warrior() )
		list.add(wz); //list.add( new Wizard() )
		list.add(ac); //list.add( new Archer() )
//		list.add(hero1); //list.add( new Hero() )
//		list.add(hero2); //list.add( new Warrior() )
		
		for(Hero obj : list) {
			obj.attack();
			
			if(obj instanceof Warrior) {
				Warrior h = (Warrior) obj;  //다운 캐스팅
				h.groundCutting();
//				((Warrior) obj).groundCutting(); 한문장 요약가능
				System.out.println(h.getClass());
				
				Calendar c = Calendar.getInstance();
				System.out.println(c);
				System.out.println(c.get(Calendar.YEAR) + "년");
				System.out.println(c.get(Calendar.MONTH) + 1 +"월"); //MONTH는 0부터 시작
				System.out.println(c.get(Calendar.DATE) + "일");
				
				long time = System.currentTimeMillis();
			}
			
			else if(obj instanceof Wizard) {
				Wizard h = (Wizard) obj;  //다운 캐스팅
				h.freezing();
//				((Wizard) obj).freezing(); 한문장 요약가능
				System.out.println(h.getClass());
			}
			
			else if(obj instanceof Archer) {
				Archer h = (Archer) obj;  //다운 캐스팅
				h.fireArrow();
//				((Archer) obj).fireArrow(); 한문장 요약가능
				System.out.println(h.getClass());
			}
		}
	}

}
