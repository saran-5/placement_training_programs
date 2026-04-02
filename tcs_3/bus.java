package tcs_3;
import java.util.*;
public class bus {
    static String[] BusStops = {"TH","GA","IC","HA","TE","LU","NI","CA"};
    static int[] Path = {800,600,750,900,1400,1200,1100,1500};

    public static void getFare(String Source, String Destination) {
        Source = Source.toUpperCase();
        Destination = Destination.toUpperCase();
        int n = BusStops.length;
        int sourceIndex = -1;
        int destIndex = -1;
        for(int i=0;i<n;i++)
        {
            if(BusStops[i].equals(Source))
                sourceIndex = i;
            if(BusStops[i].equals(Destination))
                destIndex = i;
        }
        if(sourceIndex == -1 || destIndex == -1 || sourceIndex == destIndex)
        {
            System.out.println("INVALID OUTPUT");
            return;
        }
        int distance = 0;
        int i = sourceIndex;

        while(i != destIndex)
        {
            distance += Path[i];
            i = (i + 1) % n;
        }
        double fare = Math.ceil(distance / 200.0);
        System.out.println(fare + " INR");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        String destination = sc.next();
        getFare(source, destination);
    }
   
}
