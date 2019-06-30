package com.lqp.bytedance;

/**
 * Created by lqp
 * Date: 2019/6/30
 * 1��Collection �����ϵ����ӿڣ��̳й�ϵ
 *
 *
 * ��������List�����Դ���ظ�������
 *
 *
 * ��������Set�������ܴ���ظ������ݣ����Ե��ظ����ݿ�hashCode()��equals()������������
 *
 *
 * ��������Queue�������нӿ�
 *
 *
 * ��������SortedSet�������ԶԼ����е����ݽ�������
 *
 *
 * Collection�����˼��Ͽ�ܵĹ��Թ��ܡ�
 *
 *
 * 1�����
 * add(e);
 * addAll(collection);
 *
 *
 * 2��ɾ��
 * remove(e);
 * removeAll(collection);
 * clear();
 *
 *
 * 3���жϡ�
 * contains(e);
 * isEmpty();
 *
 *
 * 4����ȡ
 * iterator();
 * size();
 *
 *
 * 5����ȡ������
 * retainAll();
 *
 *
 * 6�����ϱ����顣
 * toArray();
 *
 *
 * *add�����Ĳ���������Object���Ա��ڽ����������Ͷ���
 *
 *
 * *�����д洢�Ķ��Ƕ��������(��ַ)
 *
 *
 * 2��List�ĳ�������
 *
 *
 * List��
 * ���з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ�����
 *
 *
 * ��
 * add(index,element);
 * addAll(index,Collection);
 *
 *
 * ɾ
 * remove(index);
 *
 *
 * ��
 * set(index,element);
 *
 *
 * ��
 * get(index):
 * subList(from,to);
 * listIterator();
 * int indexOf(obj):��ȡָ��Ԫ�ص�λ�á�
 * ListIterator listIterator();
 *
 * 3����List����
 *
 * ����ArrayList �����̲߳���ȫ����ѯ�ٶȿ�
 *
 *
 * ����Vector�����̰߳�ȫ�����ٶ������ѱ�ArrayList���
 *
 *
 * ����LinkedList��������������ɾ�ٶȿ�
 *
 *
 * 4��Set�ӿ�
 *
 *
 * Set��Ԫ��������(�����ȡ����˳��һ��һ��)��Ԫ�ز������ظ���
 *
 *
 * |����HashSet:�ײ����ݽṹ�ǹ�ϣ�����̲߳���ȫ�ġ���ͬ����
 *
 *
 * ����HashSet����α�֤Ԫ��Ψһ�Ե��أ�
 * ������ͨ��Ԫ�ص�����������hashCode��equals����ɡ�
 * �������Ԫ�ص�HashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue��
 * �������Ԫ�ص�hashcodeֵ��ͬ���������equals��
 *
 *
 * ����ע��,�����ж�Ԫ���Ƿ���ڣ��Լ�ɾ���Ȳ����������ķ�����Ԫ�ص�hashcode��equals������
 *
 *
 * |����TreeSet��
 *
 *
 * ����Ĵ�ţ�TreeSet���̲߳���ȫ�����Զ�Set�����е�Ԫ�ؽ�������
 *
 *
 * ͨ��compareTo����compare��������֤Ԫ�ص�Ψһ�ԣ�Ԫ���Զ���������ʽ��š�
 *
 *
 * 5��Object��
 *
 *
 * *��ʵ�ʿ����о�������������ͬһ��������⣬һ������������ø�дObject���hashCode()��equals()��toString()����������
 *
 *
 * 6�����ϵ����
 *
 *
 * ����4�ֳ����������ʽ
 *
 *
 * ����Iterator�� ���������ʹ�����������ʽ
 *
 *
 * ����ListIterator�� Iterator���ӽӿڣ�ר���������List�е�����
 *
 *
 * ����Enumeration
 *
 *
 * ����foreach
 *
 *
 * �ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�أ���Ϊ�ᷢ��ConcurrentModificationException�쳣�����ԣ��ڵ�����ʱ��ֻ���õ������ķ�������Ԫ�أ�����Iterator���������޵ģ�ֻ�ܶ�Ԫ�ؽ����жϣ�ȡ����ɾ���Ĳ����������Ҫ�����Ĳ�������ӣ��޸ĵȣ�����Ҫʹ�����ӽӿڣ�ListIterator��
 *
 *
 * �ýӿ�ֻ��ͨ��List���ϵ�listIterator������ȡ��
 *
 *
 * 7��Map�ӿ�
 *
 *
 * *Correction��Set��List�ӿڶ����ڵ�ֵ�Ĳ�������Map�е�ÿ��Ԫ�ض�ʹ��key����>value����ʽ�洢�ڼ����С�
 *
 *
 * Map���ϣ��ü��ϴ洢��ֵ�ԡ�һ��һ������档����Ҫ��֤����Ψһ�ԡ�
 *
 *
 * 1����ӡ�
 * put(K key, V value)?
 * putAll(Map<? extends K,? extends V> m)
 *
 *
 * 2��ɾ����
 * clear()?
 * remove(Object key)
 *
 *
 * 3���жϡ�
 * containsValue(Object value)?
 * containsKey(Object key)?
 * isEmpty()
 *
 *
 * 4����ȡ��
 * get(Object key)?
 * size()?
 * values()
 * entrySet()?
 * keySet()
 *
 *
 * 8��Map�ӿڵĳ�������
 *
 *
 * Map
 *
 *
 * |HashMap���ײ��ǹ�ϣ�����ݽṹ������ʹ�� null ֵ�� null �����ü����ǲ�ͬ���ġ���hashtable�����jdk1.2.Ч�ʸߡ�
 *
 *
 * |--TreeMap���ײ��Ƕ��������ݽṹ���̲߳�ͬ�����������ڸ�map�����еļ���������
 *
 *1.Java.util.ArrayList���ࣩ
 *
 *
 *
 *
 * import java.awt.*;
 * import java.util.*;
 * public class CollectionTest
 * {//List��һ���ܰ����ظ�Ԫ�ص��������Collection,��ʱlistҲ��Ϊ���У�List��һ��Ԫ�ص��±�Ϊ0
 *      public String colors[]={"red","white","blue"};//����һ���ַ�����
 *
 *      //���캯��
 *      public CollectionTest()
 *      {
 *           ArrayList list=new ArrayList();//ʵ����һ��ArrayList
 *           list.add(Color.magenta);//���������һ��Ԫ�أ���������ɫ
 *
 *           for(int count=0;count<colors.length;count++)
 *               list.add(colors[count]);//���뿪ʼ�����������е�Ԫ��
 *
 *           list.add(Color.cyan);     //��ɫ��������awt��
 *           System.out.println("\nArrayList");
 *           for(int count=0;count<list.size();count++)
 *              System.out.println(list.get(count)+" ");//��arrayList�ж�ȡ��Ԫ��
 *
 *           removeString(list);
 *           System.out.println("\n\nArrayList after calling"+"removeString:");
 *           for(int count=0;count<list.size();count++)
 *                  System.out.println(list.get(count)+" ");
 *      }
 *
 *
 *         public void removeString(Collection collection)
 *         {
 *              Iterator itrator=collection.iterator();    //����һ������
 *              //����itrator��hasNext�����ж�Collection�Ƿ񻹰���Ԫ��
 *              while(itrator.hasNext())
 *              {
 *                   //����itrator��next���������һ��Ԫ�ص�����
 *                   if( itrator.next() instanceof String ) // instanceof���ж��Ƿ���String����ʵ��
 *                         itrator.remove();    //����ǵġ���ɾ��
 *              }
 *         }
 *
 *      public  static void main(String[] args)
 *      {
 *           new CollectionTest();
 *      }
 *
 * }
 *
 *
 * ����ʾ����ArrayList��ʹ�á���������һString���͵����飬����洢�ˡ���ɫ���������ַ���д������ɫ��������ַ����������ArrayListʵ����ͬʱ��������awt���ڵ���ɫʵ����ȫ����������õ�����ɾ������Ҫ��ļ����ݣ�Ҳ�����������ַ���д����ɫ��Ҳ�õ��� instanceof������һ����Ԫ��������������equals�����ж�instanceof��ߡ��Ķ����Ƿ��ǡ��ұ߶����ʵ�������ǡ������棬����Ϳ����жϡ�ArrayList����������ɫ������ɫ�ǡ��ַ����ġ�ʵ������������ͨ��������һ�����Աȡ�ֻҪ��String��ʵ���ͽ����������ɾ�����������ArrayList�������ʣ�¶���Ԫ�أ�����Ч�����£�
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 2.java.util.HashSet���ࣩ
 *
 *
 *
 *
 * //Set�ǰ�����һ�޶�Ԫ�ص�Collection��HashSet������Ԫ�ش洢�ڹ�ϣ���У���TreeSet������Ԫ�ش洢������
 * import java.util.*;
 *
 * public class SetTest
 * {
 *      private String colors[]={"orange","tan","orange","white",  "gray"};
 *      public SetTest()
 *      {
 *               ArrayList list;
 *               list=new ArrayList(Arrays.asList(colors));
 *               System.out.println("ArrayList:"+list);
 *               printNonDuplicates(list);
 *      }
 *
 *
 *      public void printNonDuplicates(Collection collection)
 *      {
 *           //����HashSetɾ��Collection�ж����Ԫ��
 *           HashSet set=new HashSet(collection);
 *           //����coolection����HashSet�󼴻������ظ�Ԫ��
 *           System.out.println("set��"+set);
 *
 *           Iterator itrator=set.iterator();
 *           System.out.println("\nNonDuplicates are:");
 *           while(itrator.hasNext())
 *           System.out.println(itrator.next()+" ");
 *           System.out.println();
 *      }
 *
 *      public static void main(String[] args)
 *      {
 *             new SetTest();
 *      }
 *
 * }
 *
 * ����Ľ��Ϊ:
 *
 *
 *
 *
 *
 *
 *
 *
 * ���Կ����ظ�Ԫ��orange��ȥ�ˡ�
 *
 *
 *
 *
 *
 * 3.java.util.Set���ӿڣ�
 *
 *
 *
 *
 * import java.util.HashSet;
 * import java.util.Iterator;
 * import java.util.Set;
 *
 * class TestSet
 * {
 *      public static void main(String args[])
 *      {
 *          Set set = new HashSet();
 *          set.add("aaa");
 *          set.add("bbb");
 *          set.add("aaa");//���������ظ���Ԫ�ؾ���Ч
 *          set.add("bbb");
 *          set.add("aaa");
 *          set.add("bbb");
 *          set.add("aaa");
 *          set.add("bbb");
 *          set.add("aaa");
 *          set.add("bbb");
 *          Iterator ite=set.iterator();
 *          System.out.println(set.size());//the result is 2
 *          while(ite.hasNext())
 *          {
 *              System.out.println("----"+ite.next());
 *           }
 *      }
 * }
 *
 *
 * ������Ϊ:
 *
 *
 *
 *
 *
 *
 *
 * 4.java.util.List���ӿڣ�
 *
 *
 *
 *
 * package tt;
 *
 * import java.util.Arrays;
 * import java.util.Collections;
 * import java.util.Iterator;
 * import java.util.LinkedList;
 * import java.util.List;
 *
 * public class ListTest {
 *
 *     public static void baseUse(){
 *             //����ʵ��
 *             List list = new LinkedList();
 *             //����ʵ��
 *             //List list = new ArrayList();
 *             list.add("a");//���б��β��׷��"a"
 *             System.out.println("ʹ��list�ӿڵ�add()һ�������ķ�����"+list);
 *             list.add(0,"b");//��ָ��λ�ò���"b"
 *             System.out.println("ʹ��list�ӿڵ�add���������ķ�����"+list);
 *             list.remove("a");//�Ƴ��б���"a"
 *             System.out.println("ʹ��list�ӿڵ�remove()����ɾ��a��"+list);
 *      }
 *       public static void useSort(){
 *             String[] strArray = new String[] {"z", "a", "c","C"};
 *             List list = Arrays.asList(strArray);
 *             System.out.println(list);
 *             Collections.sort(list);//����Ԫ����Ȼ˳������
 *             System.out.println("��Ȼ˳��"+list);
 *             Collections.sort(list, String.CASE_INSENSITIVE_ORDER);//����ָ������ĸ��ʽ����
 *             System.out.println("ָ����ĸ��ʽ��"+list);
 *             Collections.sort(list, Collections.reverseOrder());//���ݷ�ת��Ȼ˳��ʽ����
 *             System.out.println("��ת��Ȼ˳��"+list);
 *             Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
 *             System.out.println(list);
 *             Collections.reverse(list);//��ת�б�����
 *             System.out.println(list);
 *       }
 *
 *     public static void main(String[] args) {
 *
 *         baseUse();
 *     //    useSort();
 *     }
 *
 * }
 *
 * ����
 *
 *
 *
 *
 *
 *
 *
 *
 * 5.java.util.TreeSet���ࣩ
 *
 *
 *
 *
 * package tt;
 *
 * import java.util.Iterator;
 * import java.util.TreeSet;
 *
 * public class TreeSetTest {
 *
 *      public static void main(String args[]){
 *           TreeSet a = new TreeSet();
 *           a.add("1167014513046,hondanna_mousepress");
 *           a.add("1167014512046,hondanna_mousepress_usefull");
 *           a.add("1167014511046,hondanna_mousepress_num");
 *           a.add("1167014515437,hondanna_mousepress");
 *           a.add("1167014514438,hondanna_mousepress_usefull");
 *          Iterator iterator = a.iterator();
 *          while(iterator.hasNext())
 *              System.out.println(iterator.next());
 *          }
 * }
 *
 * ���н����
 *
 *
 *
 *
 *
 *
 *
 *
 * 6.java.util.Map���ӿڣ�
 *
 *
 *
 *
 *
 * ����Map�����4�ַ���
 *
 *
 *
 *
 *
 * ����һ����for-eachѭ����ʹ��entrySet������
 *
 * ��������Ĳ����ڴ���������Ҳ�����ȡ�ı�����ʽ���ڼ�ֵ����Ҫʱʹ�á�
 *
 *
 *
 *
 * Map<Integer, Integer> map = new HashMap<Integer, Integer>();
 *
 * for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
 *
 *     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
 *
 * }
 *
 *
 *
 *
 * ����������for-eachѭ���б���keys��values
 *
 *
 * ���ֻ��Ҫmap�еļ�����ֵ�������ͨ��keySet��values��ʵ�ֱ�������������entrySet��
 *
 *
 *
 *
 * Map<Integer, Integer> map = new HashMap<Integer, Integer>();
 *
 * //����map�еļ�
 *
 * for (Integer key : map.keySet()) {
 *
 *     System.out.println("Key = " + key);
 *
 * }
 *
 * //����map�е�ֵ
 *
 * for (Integer value : map.values()) {
 *
 *     System.out.println("Value = " + value);
 *
 * }
 *
 * ��������ʹ��Iterator����
 *
 * ʹ�÷��ͣ�
 *
 *
 *
 * Map<Integer, Integer> map = new HashMap<Integer, Integer>();
 *
 * Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
 *
 * while (entries.hasNext()) {
 *
 *     Map.Entry<Integer, Integer> entry = entries.next();
 *
 *     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
 *
 * }
 *
 * ��ʹ�÷��ͣ�
 *
 *
 *
 * Map map = new HashMap();
 *
 * Iterator entries = map.entrySet().iterator();
 *
 * while (entries.hasNext()) {
 *
 *     Map.Entry entry = (Map.Entry) entries.next();
 *
 *     Integer key = (Integer)entry.getKey();
 *
 *     Integer value = (Integer)entry.getValue();
 *
 *     System.out.println("Key = " + key + ", Value = " + value);
 *
 * }
 *
 * �����ġ�ͨ������ֵ������Ч�ʵͣ�
 *
 *
 *
 * Map<Integer, Integer> map = new HashMap<Integer, Integer>();
 *
 * for (Integer key : map.keySet()) {
 *
 *     Integer value = map.get(key);
 *
 *     System.out.println("Key = " + key + ", Value = " + value);
 *
 * }
 *
 * �ܽ�
 *
 * �������Ҫ��(keys)��ֵ(values)ʹ�÷������������ʹ�õ����԰汾����java 5�����Ǵ����ڱ���ʱɾ��entries������ʹ�÷�����������ʹ�÷���һ(��ֵ��Ҫ)��
 * ---------------------
 * ���ߣ�lfendo
 * ��Դ��CSDN
 * ԭ�ģ�https://blog.csdn.net/u011781521/article/details/55251067
 * ��Ȩ����������Ϊ����ԭ�����£�ת���븽�ϲ������ӣ�
 * ---------------------
 */
public class wendang {


}
