import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    //part a
    int sum = 0;
    for(int i = 0; i < myList.size(); i++)
        if(myList.get(i).length() == (len))
            sum++;
    return sum;
  }

  public void removeWordsOfLength(int len)
  {
    //Part b
    for(int i = 0; i< myList.size(); i++)
        if(myList.get(i).length() == (len)){
          myList.remove(i);
          i--;
        }
  }
}
