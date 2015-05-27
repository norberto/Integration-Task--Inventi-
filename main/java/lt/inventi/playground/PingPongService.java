package lt.inventi.playground;

import org.apache.cxf.Bus;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by GreenFigure on 2015-05-25.
 */
public class PingPongService implements Bus {
    @Override
    public <T> T getExtension(Class<T> aClass) {
        return null;
    }

    @Override
    public Object getProperty(String s) {
        return null;
    }

    @Override
    public Map<String, Object> getProperties() {
        return null;
    }

    @Override
    public Collection<Feature> getFeatures() {
        return null;
    }

    @Override
    public boolean hasExtensionByName(String s) {
        return false;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public List<Interceptor<? extends Message>> getOutFaultInterceptors() {
        return null;
    }

    @Override
    public void setProperty(String s, Object o) {

    }

    @Override
    public <T> void setExtension(T t, Class<T> aClass) {

    }

    @Override
    public void shutdown(boolean b) {

    }

    @Override
    public void run() {

    }

    @Override
    public List<Interceptor<? extends Message>> getInInterceptors() {
        return null;
    }

    @Override
    public List<Interceptor<? extends Message>> getOutInterceptors() {
        return null;
    }

    @Override
    public List<Interceptor<? extends Message>> getInFaultInterceptors() {
        return null;
    }
}
