package com.alibaba.otter.canal.instance.core;

public class CanalMQConfig {

    private String  topic;
    private Integer partition;
    private Integer partitionsNum;
    private String  partitionHash;
    private String  dynamicTopic;


    // custom param for us
    private Integer dist;

    private String keys;



    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public Integer getPartitionsNum() {
        return partitionsNum;
    }

    public void setPartitionsNum(Integer partitionsNum) {
        this.partitionsNum = partitionsNum;
    }

    public String getPartitionHash() {
        return partitionHash;
    }

    public void setPartitionHash(String partitionHash) {
        this.partitionHash = partitionHash;
    }

    public String getDynamicTopic() {
        return dynamicTopic;
    }

    public void setDynamicTopic(String dynamicTopic) {
        this.dynamicTopic = dynamicTopic;
    }

    public Integer getDist() {
        return dist;
    }

    public void setDist(Integer dist) {
        this.dist = dist;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }
}
