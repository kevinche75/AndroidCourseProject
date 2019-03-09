package com.elegion.courserafirstcourseprogrammingtest;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class CharacterCreator extends Observable  implements Serializable{

    public enum Specialization {
        WARRIOR, ARCHER, MAGE
    }

    public enum Race {
        HUMAN, ELF, ORC, DWARF
    }

    public enum Attribute {
        STRENGTH, AGILITY, INTELLECT, STAMINA, LUCK
    }

    public enum Perk {
        BERSERK, CALM, LIGHTWEIGHT, HEAVYARMORED, OBSERVANT, MEDITATIONS
    }

    private String mName;
    private Specialization mSpecialization; //+
    private Race mRace; //+
    private int mAvailablePoints; //+

    private Map<String, Integer> mAttributesMap = new HashMap<>(); //+
    private Map<String, Boolean> mPerksMap = new HashMap<>();


    public CharacterCreator() {
        mRace = Race.HUMAN;
        mSpecialization = Specialization.WARRIOR;
        mAvailablePoints = 5;
        mAttributesMap.put(Attribute.STRENGTH.name(), 5);
        mAttributesMap.put(Attribute.AGILITY.name(), 5);
        mAttributesMap.put(Attribute.INTELLECT.name(), 5);
        mAttributesMap.put(Attribute.STAMINA.name(), 5);
        mAttributesMap.put(Attribute.LUCK.name(), 5);
    }


    public String[] getSpecializations() {
        // TODO: 11.12.2017
        /*
        *   этот метод должен возвращать массив строк, созданных на основе enum Specialization
        *   Строки должны начинаться с заглавной буквы, остальные строчные
        * */

        /**
        * @created 01.03.2019
        * @author Andrey Dudin <programmer1973@mail.ru>
        * @version 0.1.0.2019.03.01
        */
        Specialization[] specializations = Specialization.values();
        String[] stringSpecialization = new String[specializations.length];
        String temporarySpecialization;

        for(int i = 0; i <= specializations.length-1; i++) {
            temporarySpecialization = specializations[i].toString();
            stringSpecialization[i] = temporarySpecialization.substring(0, 1) + temporarySpecialization.substring(1).toLowerCase();
        }

        return stringSpecialization; // new String[]{""};
    }

    public void setSpecialization(int position) {
        // TODO: 11.12.2017
        /*
        *  этот метод задает специализацию в переменную mSpecialization
        *  на вход подается число, и из enum Specialization выбирается соответствующий класс
        *  0 - Warrior
        *  1 - Archer
        *  2 - Mage
        *  если введенное число меньше 0, то в mSpecialization записывается самое первое (порядковый номер - 0) значение
        *  если введенное число больше длины enum, то в mSpecialization записывается самое последнее (длина - 1) значение
        *
        * */

        /**
         * @created 01.03.2019
         * @author Andrey Dudin <programmer1973@mail.ru>
         * @version 0.1.0.2019.03.01
         */
        if(position < 0) {
            mSpecialization = Specialization.values()[0];
        } else if(position > Specialization.values().length) {
            mSpecialization = Specialization.values()[Specialization.values().length - 1];
        } else {
            mSpecialization = Specialization.values()[position];
        }
    }

    public String[] getRaces() {
        // TODO: 11.12.2017
        /*
        *   этот метод должен возвращать массив строк, созданных на основе enum Races
        *    Строка должна быть формата - первая буква заглавная, остальные строчные
        *   One, Two, Three
        * */

        /**
         * @created 01.03.2019
         * @author Andrey Dudin <programmer1973@mail.ru>
         * @version 0.1.0.2019.03.01
         */
        Race[] race = Race.values();
        String[] stringRaces = new String[race.length];
        String temporaryRace;

        for(int i = 0; i <= race.length-1; i++) {
            temporaryRace = race[i].toString();
            stringRaces[i] = temporaryRace.substring(0, 1) + temporaryRace.substring(1).toLowerCase();
        }

        return stringRaces; //new String[]{""};
    }

    public void setRace(int position) {
        // TODO: 11.12.2017
        /*
        *  этот метод задает специализацию в переменную mRace
        *  на вход подается число, и из enum Race выбирается соответствующая раса
        *  0 - Human
        *  1 - Elf
        *  2 - Orc
        *  3 - Dwarf
        *  если введенное число меньше 0, то в mRace записывается самое первое (порядковый номер - 0) значение
        *  если введенное число больше длины enum, то в mRace записывается самое последнее (длина - 1) значение
        *
        * */

        /**
         * @created 01.03.2019
         * @author Andrey Dudin <programmer1973@mail.ru>
         * @version 0.1.0.2019.03.01
         */
        if(position < 0) {
            mRace = Race.values()[0];
        } else if(position > Race.values().length) {
            mRace = Race.values()[Specialization.values().length - 1];
        } else {
            mRace = Race.values()[position];
        }
    }

    public String[] getAttributes() {
        // TODO: 11.12.2017
        /*
        *   этот метод должен возвращать массив строк, созданных на основе enum Attribute
        *    Строка должна быть формата - первая буква заглавная, остальные строчные
        *   One, Two, Three
        * */

        /**
         * @created 01.03.2019
         * @author Andrey Dudin <programmer1973@mail.ru>
         * @version 0.1.0.2019.03.01
         */
        Attribute[] attributes = Attribute.values();
        String[] stringAttributes = new String[attributes.length];
        String temporaryAttribute;

        for(int i = 0; i <= attributes.length-1; i++) {
            temporaryAttribute = attributes[i].toString();
            stringAttributes[i] = temporaryAttribute.substring(0, 1) + temporaryAttribute.substring(1).toLowerCase();
        }

        return stringAttributes; //new String[]{""};
    }

    public String[] getPerks() {
        // TODO: 11.12.2017
        /*Быстрый старт в Android-разработку
        *   этот метод должен возвращать массив строк, созданных на основе enum Perk
        *   Строка должна быть формата - первая буква заглавная, остальные строчные
        *   One, Two, Three
        *
        * */

        /**
         * @created 01.03.2019
         * @author Andrey Dudin <programmer1973@mail.ru>
         * @version 0.1.0.2019.03.01
         */
        Perk[] perks = Perk.values();
        String[] stringPerks = new String[perks.length];
        String temporaryPerk;

        for(int i = 0; i <= perks.length-1; i++) {
            temporaryPerk = perks[i].toString();
            stringPerks[i] = temporaryPerk.substring(0, 1) + temporaryPerk.substring(1).toLowerCase();
        }

        return stringPerks; //new String[]{""};

    }
    public void updateAttributeValue(int position, int updateTo) {
        // TODO: 11.12.2017
        /*
         *  этот метод увеличивает/уменьшает соответствующее значение атрибута
         *  рекомендуется реализовывать его в последнюю очередь
         *
         * 1. на вход подается позиция изменяемого атрибута и на сколько нужно этот атрибут увеличить/уменьшить
         * 2. по позиции атрибута выявляется название атрибута из enum Attribute
         * 3. по названию атрибута получается значение атрибута из mAttributesMap
         * 4. если атрибут собирается увеличиться и у персонажа достаточно очков для увеличения атрибута (mAvailablePoints)
         *    или
         *    если атрибут собирается уменьшиться и уменьшенный атрибут будет больше 0,
         *    то атрибут изменяется, количество доступных очков меняется в противоположную сторону.
         *
         * 5. убедитесь в том, что измененное значение атрибута записано в mAttributesMap
         * 6. убедитесь в том, что измененное значение количества очков записано в mAvailablePoints;
         * 7. после изменения нужно вызвать методы setChanged(); notifyObservers();
         *    для того, чтобы изменения отразились на верстке
         *
         * пример работы алгоритма.
         * на вход подается (0, -1)
         * из значения 0 выясняем, что меняться будет атрибут STRENGTH
         * получаем текущее значение этого атрибута из mAttributesMap
         * допустим, оно равно 3
         * по условию все алгоритма все проходит
         * сила уменьшается до 2, количество доступных очков увеличивается на +1
         *
         * если STRENGTH равно 1, то ничего не происходит,
         * так как мы не можем уменьшить атрибут ниже 1
         *
         * если на вход пришло (0, 1)
         *   если доступных очков больше 0,
         *       то STRENGTH увеличивается на 1, количество доступных очков уменьшается на 1
         *   если количество доступных очков равно 0
         *       то мы не можем увеличить атрибут, ничего не происходит        *
         * */

        /**
         * @created 01.03.2019
         * @author Andrey Dudin <programmer1973@mail.ru>
         * @version 0.1.0.2019.03.01
         */
        String attr = Attribute.values()[position].name();
        Integer currentAttrValue = mAttributesMap.get(attr);
        Integer currentAvailablePoints = mAvailablePoints;

        if((currentAttrValue + updateTo >= 1) && (mAvailablePoints - updateTo) >= 0) {
            currentAttrValue = currentAttrValue + updateTo;
            currentAvailablePoints = currentAvailablePoints - updateTo;

            mAttributesMap.put(attr, currentAttrValue);
            mAvailablePoints = currentAvailablePoints;

            if(mAttributesMap.get(attr) == currentAttrValue && mAvailablePoints == currentAvailablePoints) {
                setChanged();
                notifyObservers();
            }
        }
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAvailablePoints() {
        return String.valueOf(mAvailablePoints);
    }

    public Map<String, Integer> getAttributesMap() {
        return mAttributesMap;
    }

    public void checkPerk(String text, boolean isChecked) {
        if(text!=null)
        mPerksMap.put(text, isChecked);
    }

    public Character create() {
        Character character = new Character();
        character.setName(mName);
        character.setRace(mRace);
        character.setSpecialization(mSpecialization);
        character.setAttributes(mAttributesMap);
        character.setPerks(mPerksMap);
        character.calculateParameters();
        return character;
    }

    public Specialization getSpecialization() {
        return mSpecialization;
    }

    public Race getRace() {
        return mRace;
    }

    public Map<String, Boolean> getPerksMap() {
        return mPerksMap;
    }

    public void setAvailablePoints(int availablePoints) {
        mAvailablePoints = availablePoints;
    }

    public int getRacePosition() {
        return mRace.ordinal();
    }

    public int getSpecializationPosition() {
        return mSpecialization.ordinal();
    }
}
