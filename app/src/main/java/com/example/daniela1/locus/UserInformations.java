package com.example.daniela1.locus;

import java.util.ArrayList;

/**
 * Created by eunicewang on 11/6/16.
 */


public class UserInformation {

    public String userFirstName;
    public String userLastName;
    public String username;
    public String password;
    public String email;
    public String address;
    public String phoneNumber;

    ArrayList<ArrayList> contacts = new ArrayList<ArrayList>();

    ArrayList john = new ArrayList();
    john.add(John);
    john.add(Smith);
    john.add(abc123);
    john.add(qwert12345);
    john.add(jsmith@gu.edu);
    john.add(1973 Massachusetts Avenue, Adelphi, Washington DC, 20783);
    john.add(2028347219);

    contacts.add(john);

    ArrayList david = new ArrayList();
    david.add(David);
    david.add(Kim);
    david.add(hello987);
    david.add(asdfg13579);
    david.add(dkim@gmu.edu);
    david.add(2705 School Street, Washington, Washington DC, 20024);
    david.add(2029548172);

    contacts.add(david);

    ArrayList rachel = new ArrayList();
    rachel.add(Rachel);
    rachel.add(Beck);
    rachel.add(chris567);
    rachel.add(zxcvb24680);
    rachel.add(rbeck@osu.edu);
    rachel.add(1336 Hickory Lane, Washington, Washington DC, 20005);
    rachel.add(2024776879);

    contacts.add(rachel);


    ArrayList christine = new ArrayList();
    christine.add(Christine);
    christine.add(Royal);
    christine.add(kentish135);
    christine.add(plokij986);
    christine.add(croyal@cmu.edu);
    christine.add(3038 Rhode Island Avenue, Herndon, Washington DC, 22070);
    christine.add(2023864277);

    contacts.add(christine);

    ArrayList nick = new ArrayList();
    nick.add(Nick);
    nick.add(Everett);
    nick.add(turnpike999);
    nick.add(mlnkbj735);
    nick.add(nevert@uva.edu);
    nick.add(919 Hickory Lane, Washington, Washington DC, 20036);
    nick.add(2024636743);

    contacts.add(nick);
}
