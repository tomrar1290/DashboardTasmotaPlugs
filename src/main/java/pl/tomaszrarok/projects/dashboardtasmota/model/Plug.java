package pl.tomaszrarok.projects.dashboardtasmota.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Plug {
    String name;
    Double power;
    PlugStatus status;

}
