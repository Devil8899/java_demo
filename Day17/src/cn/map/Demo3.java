package cn.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
������
	keySet() 
	values() 
	entrySet() 

*/
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map = new HashMap<String, String>();
		//���ӷ���
		map.put("jerry", "shanghai");
		map.put("tom", "Beijing");
		map.put("jack","hangzhou");
		map.put("Eason", "taibei");
		/*
		//map�����б�����ʽһ�� ʹ��keySet�������б���       ȱ�㣺 keySet����ֻ�Ƿ��������еļ���û��ֵ�� 
		Set<String> keys = map.keySet();  //keySet() ��Map�����е����м������浽һ��Set���� �ļ��϶����з��ء�
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("����"+ key+" ֵ��"+ map.get(key));
		}
		
		
		
		//map���ϵı�����ʽ���� ʹ��values�������� ������    ȱ�㣺 values����ֻ�ܷ������� ��ֵ��û�м���
		Collection<String>  c = map.values(); 
		//values() �����е�ֵ�洢��һ��Collection�����з��ء�
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			System.out.println("ֵ��"+ it.next());
		}
		*/
		
		//map���ϵı�����ʽ���� entrySet����������
		/*Set<Map.Entry<String,String>>  entrys = map.entrySet(); 
		Iterator<Map.Entry<String,String>> it = entrys.iterator();
		while(it.hasNext()){
			Map.Entry<String,String> entry = it.next();
			System.out.println("����"+ entry.getKey()+" ֵ��"+ entry.getValue());
		}
		*/
	
	}
}