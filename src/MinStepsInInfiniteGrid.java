import java.util.ArrayList;

public class MinStepsInInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps = 0;
        for(int i = 0;i<A.size()-1;i++)
        {
            int xDiff = A.get(i+1) - A.get(i);
            int yDiff = B.get(i+1) - B.get(i);
            if(xDiff<0)
                xDiff *= -1;
            if(yDiff<0)
                yDiff *= -1;
            steps += max(xDiff,yDiff);
        }
        return steps;
    }
    public int max(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    public int min(int a,int b)
    {
        if(a<b)
            return a;
        else
            return b;
    }
}
