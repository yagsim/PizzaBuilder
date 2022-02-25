public class BuilderPizza {
        // este es el objeto que va a construir nuestro Builder
        // utilizamos el guion bajo para remarcar que es un objeto de esta clase
        protected Pizza _pizza;

        // metodo que devuelve el objeto terminado
        public Pizza build() {
            return this._pizza;
        }

        // crea la pizza para configurarla
        public BuilderPizza() {

            _pizza = new Pizza();
        }

        // metodos para la personalizacion de la pizza
        public BuilderPizza setTipoMasa(int tipoMasa) {
            _pizza.setTipoMasa(tipoMasa);
            return this;
        }

        public BuilderPizza setSize(int size) {
            _pizza.setSize(size);
            return this;
        }

        public BuilderPizza setRelleno(boolean relleno) {
            _pizza.setRellena(relleno);
            return this;
        }

        public BuilderPizza setCebolla(boolean cebolla) {
            _pizza.setCebolla(cebolla);
            return this;
        }

        public BuilderPizza setSinGluten(boolean sinGluten){
            _pizza.setSinGluten(sinGluten);
            return this;
        }

        public BuilderPizza setRecojida(int recojida) {
            _pizza.setRecojida(recojida);
            return this;
        }
    }



