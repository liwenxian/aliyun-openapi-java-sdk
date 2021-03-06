package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.ChangeClusterDesiredVMCountRequest;
import com.aliyuncs.batchcompute.model.v20151111.UpdateClusterRequest;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;

/**
 * Created by guangchun.luo on 16/1/12.
 */
public class UpdateClusterRequestMarshaller {
    public static UpdateClusterRequest marshall(UpdateClusterRequest req) {

        ObjectMapper mapper = new ObjectMapper();

        //默认值不序列化
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_DEFAULT);

        String contentString = null;

        try {
            contentString = mapper.writeValueAsString(req.getClusterDescription());
        } catch (IOException e) {
            e.printStackTrace();
        }


        req.setContent(contentString.getBytes(), req.getEncoding(), req.getAcceptFormat());

        return req;
    }
}
