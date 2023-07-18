package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * There's an algorithms tournament taking place in which teams of programmers compete against each
 * other to solve algorithmic problems as fast as possible. Teams compete in a round robin, where
 * each team faces off against all other teams. Only two teams compete against each other at a time,
 * and for each competition, one team is designated the home team, while the other team is the away
 * team. In each competition there's always one winner and one loser; there are no ties. A team
 * receives 3 points if it wins and 0 points if it loses. The winner of the tournament is the team
 * that receives the most amount of points.
 *
 * Given an array of pairs representing the teams that have competed against each other and an array
 * containing the results of each competition, write a function that returns the winner of the
 * tournament. The input arrays are named competitions and results, respectively. The competitions
 * array has elements in the form of [homeTeam, awayTeam], where each team is a string of at most
 * 30 characters representing the name of the team. The results array contains information about
 * the winner of each corresponding competition in the competitions array. Specifically, results[i]
 * denotes the winner of competitions[i], where a 1 in the results array means that the home team
 * in the corresponding competition won and a 0 means that the away team won.
 *
 * It's guaranteed that exactly one team will win the tournament and that each team will compete
 * against all other teams exactly once. It's also guaranteed that the tournament will always have
 * at least two teams.
 */
public class TournamentWinner {
  public static void main(String[] args) {
    List<List<String>> matches = new ArrayList<>();
    matches.add(Arrays.asList("HTML", "C#"));
    matches.add(Arrays.asList("C#", "Python"));
    matches.add(Arrays.asList("Python", "HTML"));

    List<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));

    System.out.println(findWinner(matches, results));
  }

  private static String findWinner(List<List<String>> competitions,
                                 List<Integer> results) {
    Map<String, Integer> points = new HashMap<>();

    int index = 0;
    for(List<String> competition: competitions) {
      String winner = competition.get(Math.abs(results.get(index) - 1));

      if(points.containsKey(winner)) {
        points.put(winner, points.get(winner) + 1);
      } else {
        points.put(winner, 1);
      }
      index++;
    }

    String champ = null;
    int max = 0;
    for(Map.Entry<String, Integer> m: points.entrySet()) {
      if(m.getValue() > max) {
        champ = m.getKey();
        max = m.getValue();
      }
    }

    return champ;
  }
}
