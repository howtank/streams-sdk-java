package com.howtank.streams.client.api.response;

import com.howtank.streams.model.Stream;
import lombok.Data;

import java.util.List;

@Data
public class GetStreamsApiResponse extends ApiResponse {
    private List<Stream> streams;
}
