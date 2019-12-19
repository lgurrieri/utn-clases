package app;

/**
 * MarvelHero
 */
public class MarvelHeroData {

    private String pageId;
    private String name;
    private String urlSlug;
    private String identidad;
    private String neutralidad;

    /**
     * @param pageId
     * @param name
     * @param urlSlug
     * @param identidad
     * @param neutralidad
     */
    public MarvelHeroData(String pageId, String name, String urlSlug, String identidad, String neutralidad) {
        this.pageId = pageId;
        this.name = name;
        this.urlSlug = urlSlug;
        this.identidad = identidad;
        this.neutralidad = neutralidad;
    }

    /**
     * @return the pageId
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * @param pageId the pageId to set
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the urlSlug
     */
    public String getUrlSlug() {
        return urlSlug;
    }

    /**
     * @param urlSlug the urlSlug to set
     */
    public void setUrlSlug(String urlSlug) {
        this.urlSlug = urlSlug;
    }

    /**
     * @return the identidad
     */
    public String getIdentidad() {
        return identidad;
    }

    /**
     * @param identidad the identidad to set
     */
    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    /**
     * @return the neutralidad
     */
    public String getNeutralidad() {
        return neutralidad;
    }

    /**
     * @param neutralidad the neutralidad to set
     */
    public void setNeutralidad(String neutralidad) {
        this.neutralidad = neutralidad;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "MarvelHeroData [identidad=" + identidad + ", name=" + name + ", neutralidad=" + neutralidad
                + ", pageId=" + pageId + ", urlSlug=" + urlSlug + "]";
    }
}