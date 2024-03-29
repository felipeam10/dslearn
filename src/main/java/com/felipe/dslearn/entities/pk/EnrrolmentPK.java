package com.felipe.dslearn.entities.pk;

import com.felipe.dslearn.entities.Deliver;
import com.felipe.dslearn.entities.Offer;
import com.felipe.dslearn.entities.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Embeddable
public class EnrrolmentPK {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @OneToMany(mappedBy = "enrollment")
    private List<Deliver> deliveries = new ArrayList<>();

    public EnrrolmentPK(){}

    public EnrrolmentPK(User user, Offer offer) {
        this.user = user;
        this.offer = offer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public List<Deliver> getDeliveries() {
        return deliveries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnrrolmentPK that = (EnrrolmentPK) o;

        if (!Objects.equals(user, that.user)) return false;
        return Objects.equals(offer, that.offer);
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (offer != null ? offer.hashCode() : 0);
        return result;
    }
}
