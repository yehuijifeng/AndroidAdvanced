package com.lh.component.router_core.template;


import com.lh.component.router_annotation.model.RouteMeta;

import java.util.Map;

public interface IRouteGroup {

    void loadInto(Map<String, RouteMeta> atlas);
}
