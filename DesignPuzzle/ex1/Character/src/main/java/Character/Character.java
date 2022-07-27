package Character;

import Weapon.WeaponBehavior;

abstract class Character {
    private WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior wb){
        weaponBehavior = wb;
    }

    public String fight(){
        return weaponBehavior.useWeapon();
    }


}
