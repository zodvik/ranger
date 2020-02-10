package com.flipkart.ranger.http.model;

import com.flipkart.ranger.core.model.ServiceNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

/**
 *
 */
@Data
public class ServiceNodesResponse<T> {
    private final boolean success;
    final List<ServiceNode<T>> nodes;

    @Builder
    public ServiceNodesResponse(
            boolean success,
            @Singular List<ServiceNode<T>> nodes) {
        this.success = success;
        this.nodes = nodes;
    }
}