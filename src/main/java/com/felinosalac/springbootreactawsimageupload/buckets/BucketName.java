package com.felinosalac.springbootreactawsimageupload.buckets;

public enum BucketName {
	
	PROFILE_IMAGE("springbootreact-aws-image-upload");

	private final String bucketName;
	
	BucketName(String bucketName) {
		this.bucketName=bucketName;
	}

	public String getBucketName() {
		return bucketName;
	}
	
}
