import java.util.ArrayList;
import java.util.List;

class MetierProduitImpl implements IMetier<Produit> {
    private List<Produit> produits;

    public MetierProduitImpl() {
        produits = new ArrayList<>();
    }

    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null; // Retourne null si aucun produit n'est trouvé avec l'ID spécifié
    }

    @Override
    public void delete(long id) {
        produits.removeIf(produit -> produit.getId() == id);
    }
}