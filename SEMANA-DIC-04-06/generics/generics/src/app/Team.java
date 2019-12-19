package app;

import java.util.Arrays;

/**
 * Team
 * En esta clase se ve un ejemplo de bounding parameters.
 */
public class Team<T extends Comparable<?>> {

    private T[] team;

    public Team(T[] team) {
        this.team = team;
    }

    public T getLeader () {
        Arrays.sort(team);
        return team[team.length - 1];
    }

    /**
     * @return the team
     */
    public T[] getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(T[] team) {
        this.team = team;
    }

}