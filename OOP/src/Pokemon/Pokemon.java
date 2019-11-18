package Pokemon;

    public class Pokemon {
        String name;
        String type;
        String effectiveAgainst;

        public Pokemon(String name, String type, String effectiveAgainst) {
            this.name = name;
            this.type = type;
            this.effectiveAgainst = effectiveAgainst;
        }

        boolean isEffectiveAgainst(Pokemon anotherPokemon) {
            return this.effectiveAgainst.equals(anotherPokemon.type);
        }

        }

