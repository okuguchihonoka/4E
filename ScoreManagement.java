import java.util.*;
import java.lang.Math.*;

public class ScoreManagement{
  private ArrayList<Integer> scoredata = new ArrayList<Integer>();
  private int max = 0,min = 100,size;
  private double average,median;
  
  // 保存したデータから値を計算
  public void calculate(ArrayList<Integer> data){
    scoredata = new ArrayList<Integer>(data);
    size = scoredata.size(); //省略のため 

    for(int i = 0;i < size;i++){
      max = Math.max(max,scoredata.get(i));
      min = Math.min(min,scoredata.get(i));
      average += scoredata.get(i);
    }
    average = average / size;
    
    // 中央値計算
    // データの数で計算方法が異なる
    if((size % 2) == 0){
      median = (scoredata.get(size / 2) + scoredata.get(size / 2 - 1)) / 2;
    }
    else{
      median = scoredata.get(size / 2);
    }
  }

  // 最高点、最少点、平均点、中央値を取得
  public int getMax(){
    return max;
  }

  public int getMin(){
    return min;
  }

  public double getAverage(){
    return average;
  }

  public double getMedian(){
    return median;
  }
}
