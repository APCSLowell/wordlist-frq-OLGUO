import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int sum = 0;
    for(int i = 0; i < myList.length; i++)
        if(myList[i].length.equals(len))
            sum++;
    return sum;
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = 0; i< myList.length; i++)
        if(myList[i].length.equals(len))
          myList.remove(i);
    return myList;
  }
}
