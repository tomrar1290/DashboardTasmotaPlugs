package pl.tomaszrarok.projects.dashboardtasmota.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Plug {
    String name;
    Double power;
    PlugStatus status;

    public void toggle() {
        if( status != null) {
          switch (status){
              case ENABLED:
                  status = PlugStatus.DISABLED;
                  break;
              case DISABLED:
                  status = PlugStatus.ENABLED;
                  break;
          }
        }
    }
}
