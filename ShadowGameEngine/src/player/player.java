package player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Globals.Global.*;
/**
 *
 * @author Joshua
 */
public class player {
    Object Gender = Globals.Global.Gender;
    String Name = Globals.Global.Name;
    Double Health = Globals.Global.Health;
    Double Attack = Globals.Global.Attack;
    Double Defense = Globals.Global.Defense;
    Double HealthMult = Globals.Global.HealthMult;
    Double HealthDiv = Globals.Global.HealthDiv;
    Double HealthAdd = Globals.Global.HealthAdd;
    Double HealthSub = Globals.Global.HealthSub;
    Double AttackMult = Globals.Global.AttackMult;
    Double AttackDiv = Globals.Global.AttackDiv;
    Double AttackAdd = Globals.Global.AttackAdd;
    Double AttackSub = Globals.Global.AttackSub;
    Double DefenseMult = Globals.Global.DefenseMult;
    Double DefenseDiv = Globals.Global.DefenseDiv;
    Double DefenseAdd = Globals.Global.DefenseAdd;
    Double DefenseSub = Globals.Global.DefenseSub;
    public void healthmod(){
        Health = Health * HealthMult;
        Health = Health / HealthDiv;
        Health = Health + HealthAdd;
        Health = Health - HealthSub;
        }
    public void attackmod(){
        Attack = Attack * AttackMult;
        Attack = Attack / AttackDiv;
        Attack = Attack + AttackAdd;
        Attack = Attack - AttackSub;
        }
    public void defensemod(){
        Defense = Defense * DefenseMult;
        Defense = Defense / DefenseDiv;
        Defense = Defense + DefenseAdd;
        Defense = Defense - DefenseSub;
        }
}
