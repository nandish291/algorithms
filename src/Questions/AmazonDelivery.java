package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * There were a large number of orders placed on Amazon Prime Day. The orders are packed and are at the warehouse ready to be delivered. The delivery agent needs to deliver them in as few trips as possible.
 * In a single trip, the delivery agent can choose packages following either of two rules:
 * Choose two packages with the same weight
 * • Choose three packages with the same weight
 * Determine the minimum number of trips required to deliver the packages. If it is not possible to deliver all of them, return -1.
 */
public class AmazonDelivery {
  public static int minTripsToDeliverPackages(List<Integer> weights) {
    // Count the frequency of each weight
    HashMap<Integer, Integer> weightCounts = new HashMap<>();
    for (int weight : weights) {
      weightCounts.put(weight, weightCounts.getOrDefault(weight, 0) + 1);
    }

    // Initialize the number of trips
    int trips = 0;

    // Iterate through the weight counts

    for (int weight : weightCounts.keySet()) {
      while (true) {
        int size = weightCounts.get(weight);
        if (weightCounts.get(weight) == 0) {
            break;
          }
        if (size % 3 == 0) {
          trips++;
          weightCounts.put(weight, weightCounts.get(weight) - 3);
        } else if (size % 2 == 0) {
          trips++;
          weightCounts.put(weight, weightCounts.get(weight) - 2);
        } else if (size > 3) {
          trips++;
          weightCounts.put(weight, weightCounts.get(weight) - 3);
        } else {
          return -1;
        }
      }
    }
    return trips;
  }

  public static void main(String[] args) {
    List<Integer> weights = new ArrayList<>();
    weights.add(2);
    weights.add(4);
    weights.add(6);
    weights.add(6);
    weights.add(4);
    weights.add(2);
    weights.add(4);
    System.out.println(minTripsToDeliverPackages(weights));  // Output: 4
  }
}
