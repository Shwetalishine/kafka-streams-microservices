package com.kafka.domain.crawler;

import java.util.List;

public class DomainList {

    private List<Domain> domains;

    public DomainList() {
    }

    public DomainList(List<Domain> domains) {
        this.domains = domains;
    }

    public List<Domain> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain> domains) {
        this.domains = domains;
    }
}
