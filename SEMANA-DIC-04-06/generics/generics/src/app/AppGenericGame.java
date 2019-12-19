package app;

import race.Pilot;
import roleplayer.Player;

/**
 * AppGenericGame
 */
public class AppGenericGame {


    /**
     * Ejemplo aplicado a un juego de carreras
     */

    public static void main(String[] args) {
        Pilot pilot1 = new Pilot("Ricky", 260, 100);
        Pilot pilot2 = new Pilot("Morty", 220, 45);
        Pilot pilot3 = new Pilot("Laura", 280, 60);
        Pilot pilot4 = new Pilot("Mary", 240, 50);

        Pareja<Pilot> pilotos = new Pareja<Pilot>(pilot1, pilot2);

        Player player1 = new Player("GG", 1000, 678);
        Player player2 = new Player("AF", 250, 69);
        Player player3 = new Player("FF", 10000, 6985);

        Pareja<Player> jugadores = new Pareja<Player>(player1, player2);

        System.out.println("Pareja de jugadores primero: "+jugadores.getPrimero().getName());

        Pareja<String> tenistas = new Pareja<String>("Federer", "Del Potro");

        System.out.println(tenistas.getSegundo());

        Pilot[] team = {pilot1, pilot2, pilot3, pilot4};

        Team<Pilot> equipoPilotos = new Team<Pilot>(team);

        System.out.println(equipoPilotos.getLeader());



        Player[] players= {player1, player2, player3};

        Team<Player> equipoRolePlayers = new Team<Player>(players);

        System.out.println(equipoRolePlayers.getLeader());

        String[] empleados = {"ALVAREZ", "PEREZ", "MARTOS", "SANCHEZ", "ZAPA", "ZAPATA"};

        Team<String> equipoEmpleados = new Team<String>(empleados);

        System.out.println(equipoEmpleados.getLeader());
    }





}